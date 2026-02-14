FROM ubuntu:latest
LABEL authors="jmari"

ENTRYPOINT ["top", "-b"]