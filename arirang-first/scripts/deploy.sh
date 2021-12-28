#!/bin/bash

echo "> 아리랑 프로젝트 어플리케이션 배포 시작"

BUILD_PATH=/home/ubuntu/arirang-first/build/arirang-first-0.0.1.jar
JAR_NAME=$(basename $BUILD_PATH)
echo "> build 파일명: $JAR_NAME"

echo "> build 파일 복사"
DEPLOY_PATH=/home/ubuntu/arirang-first/
cp $BUILD_PATH $DEPLOY_PATH

echo "> arirang-first-0.0.1.jar 교체"
CP_JAR_PATH=$DEPLOY_PATH$JAR_NAME
APPLICATION_JAR_NAME=arirang-first-0.0.1.jar
APPLICATION_JAR=$DEPLOY_PATH$APPLICATION_JAR_NAME

ln -Tfs $CP_JAR_PATH $APPLICATION_JAR

echo "> 현재 실행중인 애플리케이션 pid 확인"
CURRENT_PID=$(pgrep -f $APPLICATION_JAR_NAME)

if [ -z $CURRENT_PID ]
then
  echo "> 현재 구동중인 애플리케이션이 없으므로 종료하지 않습니다."
else
  echo "> kill -15 $CURRENT_PID"
  kill -15 $CURRENT_PID
  sleep 15
fi

echo "> $APPLICATION_JAR 배포"
java -jar $APPLICATION_JAR > /dev/null 2> /dev/null < /dev/null &

#CURRENT_SERVER_ADDRESS=$(hostname -I)
#echo "> CURRENT_SERVER_ADDRESS : $CURRENT_SERVER_ADDRESS"

#if [ ${CURRENT_SERVER_ADDRESS} = "10.2.10.200" ]
#then
#  echo "> 운영서버이므로 운영 환경으로 배포합니다."
#  java -jar -Dspring.profiles.active=prod $APPLICATION_JAR > /dev/null 2> /dev/null < /dev/null &
#else
#  echo "> 개발서버이므로 개발 환경으로 배포합니다."
#  java -jar $APPLICATION_JAR > /dev/null 2> /dev/null < /dev/null &
#fi

echo "> 서버가 성공적으로 배포되었습니다. "
