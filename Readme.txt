This project serves as part of my technical interview process for fintax

To use this project 
1. Download all the files (mainly Client and Server files) and move them into the same folder or directory
2. Make sure that you have Java installed and port 3000 is available for usage
3. Open two Command Prompt/Powershell/Terminal window within the directory which contains two previous files
4. In the first window run the following command, this window will be referred as client 
    java Client 
5. In the second window run the following command, this window will be referred as server 
    java Server 
6. In the first window the correct login is 
    nodeABC 
    or 
    nodeXYZ
7. The password for nodeABC is PazA999 and the password for nodeXYZ is PazZ111
8. Using other passwords will result in the number of attempts being increased by the program, to see the 
total number of attempts enter the correct password for one of the login accounts and the result will be shown at 
the server window 




To deploy
Open two separate CMD/Terminal window on this directory 
Enter the following command on both window:

//Change this directory into apache-ant directory
export ANT_HOME=~/Downloads/Alpha/apache-ant-1.10.10 
export PATH=${PATH}:${ANT_HOME}/bin  

Enter the following command on the first window
ant -buildfile $ANT_HOME/bin/buildServer.xml

Enter the following command on the second window
ant -buildfile $ANT_HOME/bin/buildClient.xml

Follow the instructions on the first part to use the login method
