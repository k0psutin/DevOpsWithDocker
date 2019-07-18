FROM node:10-alpine AS builder
WORKDIR /app
COPY . .
RUN npm install --only=production && npm run build && npm audit fix

FROM node:10-alpine AS production
WORKDIR /app
COPY --from=builder ./app/dist ./dist
RUN npm install -g serve && adduser -D app_user && chown -h app_user /app
USER app_user
EXPOSE 5000
CMD ["serve","-s","-l","5000","dist"]
