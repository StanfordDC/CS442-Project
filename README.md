
## About the Project
Encryption solution based on Identity-based encryption for Supervisory Control and Data Acquisition (SCADA) system in water treatment plant  


### Built With
* [![JDK][JDK.com]][JDK-url]




<!-- GETTING STARTED -->
## Getting Started

### Installation (Windows)
1. Clone the repo
   ```sh
   git clone https://github.com/StanfordDC/CS442-Project.git
   ```
2. Change directory into the repo
    ```sh
    cd CS442-Project
    ```
3. Send encrypted messages
   ```sh
   javac Station/Station.java
   java Station/Station
   ```
   Enter station name, plant name and message
   
4. Decrypt messages

   ```sh
   javac CentralWaterPlant/CentralWaterPlant.java
   java CentralWaterPlant/CentralWaterPlant
   ```
   Enter plant name
   

[Spring-Boot-url]: https://docs.spring.io/spring-boot/docs/current/reference/html/
[Spring-Boot.com]: https://img.shields.io/badge/SpringBoot-3.0.2-brightgreen
[MAVEN-url]: https://maven.apache.org/
[MAVEN.com]: https://img.shields.io/badge/MAVEN-3.8-red
[JDK-url]: https://jdk.java.net/17/
[JDK.com]: https://img.shields.io/badge/JAVA--JDK-17-orange
[AWS-MQ-url]: https://aws.amazon.com/amazon-mq/
[AWS-MQ.com]: https://img.shields.io/badge/AWS-MQ-orange
