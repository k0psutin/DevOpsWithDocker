FROM ruby:2.6.0

EXPOSE 3000

WORKDIR /app
COPY . /app

RUN apt-get update && apt-get install -y vim curl
RUN curl -sL https://deb.nodesource.com/setup_10.x | bash
RUN apt-get install -y nodejs

RUN gem install bundler
RUN bundle install

ENV RAILS_ENV=production

RUN rails db:migrate
RUN rake assets:precompile

ENV RAILS_LOG_TO_STDOU=true
ENV EDITOR=vim

CMD ["rails", "s", "-e", "production"]
