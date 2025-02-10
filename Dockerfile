FROM ubuntu:22.04


RUN apt update
RUN apt -y install python3
#test.py 파일을 컨테이너의 /home에 이동시켜라
#COPY C:\Users\ACER\Desktop\test.py /home

EXPOSE 8000

RUN python test.py

#CMD ["python", "/home/test.py"]