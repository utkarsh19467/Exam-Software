/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.10 : Database - newnetic
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`newnetic` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `newnetic`;

/*Table structure for table `aptitude` */

DROP TABLE IF EXISTS `aptitude`;

CREATE TABLE `aptitude` (
  `Qno` decimal(50,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(100) DEFAULT NULL,
  `b` varchar(100) DEFAULT NULL,
  `c` varchar(100) DEFAULT NULL,
  `d` varchar(100) DEFAULT NULL,
  `correct` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `aptitude` */

insert  into `aptitude`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correct`) values (1,' A police spotted a thief when he was 125 meters ahead of him. The thief ran @ 9 km/hour and the police chased him @ 10 km/hour. How far did the constable run to catch the thief?','900 m	','750 m	','1200 m ','1250 m ','d'),(2,'A man purchased a house for Rs. 4800 and got it insured for Rs. 5000 so that in case of loss he may recover the cost of the house and also the premium paid. The rate of premium is','3%	','4% ','5%	','6%','b'),(3,'A man travels 630 km partly by car and partly by bus. It takes 12 hours in all if he travels 180 km by bus and rest by car. If he travels 120 km by bus and remaining distance by car it saves him 30 minutes. Find the speed of the bus.','45 km/hr ','50 km/hr ','60 km/h60 km/hr		','55km/hr','a'),(4,'A is twice as good a workman as B and takes 18 days less to do a piece of work than B takes. A and B together can finish the work in ','15 Days ','12 Days ','18 Days ','12 Days ','b'),(5,' If one-fourth of A’s monthly income is equal to two-seventh of B’s monthly income and the total monthly income of both A and B is Rs. 60000, what is B’s monthly income (in Rs.)?','29000	','40000	','28000 ','20000','c'),(6,'The ratio of Copper and Nickel in an alloy should be 4: 5. Due to an incorrect process, the resultant alloy has these in the ratio 5: 4 What % more of nickel needs to be added so that the required ratio of 4:5 is obtained?','56.25%	 ','31.25%	','50%	','62.5%','a'),(7,'What proportion of a mixture containing X and Y in the proportion of 7: 5 be removed and equivalent quantity of Y added so that the resulting mixture has both in equal proportion?','2/7','1/7 ','5/12	','12/7','b'),(8,'Cost of a camera including 15% duty was Rs.4600. What was the price at which the camera was bought?','Rs.3910	','Rs.4000	','Rs.4200	','None of the above','b'),(9,'The recent tariff hike of 3% by Indian Airlines witnessed a 2% fall in the air travel. However, despite the fall, the income of IA increased by Rs.4.7 crores. What was the income of IA prior to the tariff hike?','100 crores	','50 crores	','5 crores	','500 crores ','d'),(10,'The population of a city increases by 5000 per million every year. If the population of the town 3 years earlier was 120,000 what is the population now?','132,300	','138,915	','136,915	','121,809 ','d');

/*Table structure for table `ce` */

DROP TABLE IF EXISTS `ce`;

CREATE TABLE `ce` (
  `Qno` decimal(5,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(400) DEFAULT NULL,
  `b` varchar(400) DEFAULT NULL,
  `c` varchar(400) DEFAULT NULL,
  `d` varchar(400) DEFAULT NULL,
  `correct` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ce` */

insert  into `ce`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correct`) values (1,'In amotor ,the binding material is','cement','sand','surkhi','cinder','a'),(2,'Wrought iron contains carbon upto','0.25%','1.0%','1.5%','2%','a'),(3,'Pick up the ploymineralic rock from the following','Quartz sand','Pure gypsum','Magnesite','Granite','d'),(4,'Elastomers can extend upto','five times their original dimensions','seven times their original dimensions','ten times their original dimensions','three times their original dimesnions','c'),(5,'In the method of condensation ploymerization','low-molecular substances are removed from the high molecular substance','the reaction proceeds with an evolution of ammonia','the reaction proceeds with an evolution of hydrogen chloride','all the above','d'),(6,'In the cement the compound quickest to react with water is','Tricalcium aluminate','Tetra-calcium alumino-ferrite','Tricalcium silicate','Dicalcium silicate','a'),(7,'Ultimate strength to cement is provided by','Tricalcium silicate','Di-calcium silicate','Tri-calcium aluminate','Tetra calcium alumino ferrite.','b '),(8,'	Bitumen felt	','is used as water proofing material','is used as damp proofing material','is made from bitumen and hessian fibres','all the above.','d'),(9,'The main constituent of fly-ash, is','aluminium oxide','silica','ferrous oxide','All of these.','d'),(10,'The plastics made from cellulose resin','are as clear as glass','are tough and strong','possess excellent electrical properties','All the above.','d'),(11,'what is my name ?','Abhishek','utkarsh','sharad','siddharth','a');

/*Table structure for table `cse` */

DROP TABLE IF EXISTS `cse`;

CREATE TABLE `cse` (
  `Qno` decimal(5,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(400) DEFAULT NULL,
  `b` varchar(400) DEFAULT NULL,
  `c` varchar(400) DEFAULT NULL,
  `d` varchar(400) DEFAULT NULL,
  `correct` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cse` */

insert  into `cse`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correct`) values (1,'The part of machine level instruction,which tells the central processor what has to be done,is','Operation code','Addres','Locator','Flip-Flop','a'),(2,'Which of the following refers to the associative memory?','the address of the data is generated by the CPU','the address of the data is supplied by the users','there is no need for an address i>e> the data is used as an address','the data are accessed sequentially','c'),(3,'To avoid the race condition, the number of processes that may be simultaneously inside their critical section is','8','1','16','0','b'),(4,'A system program that combines the separately compiled modules of a program into a form suitable for execution','assembler','linking loader','cross compiler','load and go','b'),(5,'Process is','program in high level language kept on disk','contents of main memory','a program in execution','a job in secondary memory','c'),(6,'Which of the following is not a logical data-base structure','tree','relational','network','chain','d'),(7,'Which of the following is a database administrator\'s function?','database design','backing up database','performance monitoring','All of the above','d'),(8,'Primitive operations common to all record management system include','Print','Sort','Look-up','All of the above','c'),(9,'Each of data files has a______that describe the way the data is stored in the file ','File Structure','Records','Fields','Database','a'),(10,'Which command is used to remove an index from the database in SQL ','DELETE INDEX','DROP INDEX','REMOVE INDEX','ROLL BACK INDEX','b'),(11,'How many digits of the DNIC(Data Network identification Code) identify the country','first three','first four','first five','first six','a'),(12,'A station in a network forwards incoming packets by placing them on its shortest output queue.What routing algorithm is being used? ','hot potato routing','flooding','static routing','delta routing','a'),(13,'Frames from one LAN can be transmitted to another LAN via the device','Router','Bridge','Repeater','Modem','b'),(14,'Which of the following condition is used to tansmit two packets over a medium at the same time?','Contention','Collision','Synchronous','Asynchronous','b'),(15,'Avalanche photodiode receivers can detect hits of transmitted data by receiving','100 photons','200 photons','300 photons','400 photons','b'),(16,'The primary tool used in structured design is a:','structure chart','data-flow diagram','program flowchart','module','a'),(17,'System study involves','studt of an existing system','documenting the existing system','identifying current deficiencies and establishing new goals','All of the Above','d'),(18,'In prototyping','Basic is used','COBOL is used','4GLs are used','system is documented','c'),(19,'The step-by-step instructions that solve a problem are called______','An Algorithm','A list','A plan','A sequential structure','a'),(20,'In a ____ one module of the new information system is activated at a time','System Development Life Cycle','CASE tool','Phased Conversion','Success Factors','c'),(21,'who will tell me my name ?','sharad','siddharth','utkarsh','ankur','b'),(22,'who will tell me my name bra??','mahesh','suresh','nitin','mohan','c');

/*Table structure for table `ece` */

DROP TABLE IF EXISTS `ece`;

CREATE TABLE `ece` (
  `Qno` decimal(5,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(400) DEFAULT NULL,
  `b` varchar(400) DEFAULT NULL,
  `c` varchar(400) DEFAULT NULL,
  `d` varchar(400) DEFAULT NULL,
  `correct` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ece` */

insert  into `ece`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correct`) values (1,'An RLC series circuit is underdamped.To make it overdamped, the value of R','has to be increased','has to be decreased','has to be increased to infinity','has to be reduced to zero','a'),(2,'In a minimum function','the degree of numerator and denominator are equal','the degree of numerator and denominator are unequal','the degree of numerator is one more than degree of denominator ','the degree of numerator is one less than degree of denominator','a'),(3,'Henry is equivalent to','Volts/Ampere','Weber/Volt','Weber/Ampere','Weber/Ampere','c'),(4,'The drift velocity of electron is','very small as compared to speed light','equal to speed light','almost equal to speed light','half the speed light','a'),(5,'Wave A=100sinwt and wave B=coswt.Then','rms values of the two waves are equal','rms values of A is more than that of B','rms values is less than that of B','rms values of the two waves may or may not be equal','a'),(6,'To increase Q factor of a coil,the wire should be','long','thin','thick','long and thin','c'),(7,'In 3 phase power measurement by rwo wattmeter method , the reading of one wattmeter is zero.The power factor of load is','1','0.5','0','0.8','b'),(8,'In a CRO which of the following is not a part of electron gun','cathode','grid','accelerating anode','X-Y plates','d'),(9,'Which of the following voltmeters would you use for measuring voltage across 20K resistance','Voltmeter having a resistance of 5k','Voltmeter having a sensitivity of 1kW/V','Voltmeter having sensitivity of 10kW/V','None of the ababove','c'),(10,'An energy signal has G(f)=10.Its energy density spectrum is','10','100','50','20','b'),(11,'The first geostationary satellite launched in 1965 was called','ANIK','EARLY BIRD(Intelsat-I)','WESTAR','MOLNIYA','b'),(12,'Rotation of a geosynchronous satellite means its','drift from stationary position','wobbling','three-axis stablization','three-dimensional stabilization','b'),(13,'The present total cost per watt of power generation in geosynchronous orbit is nearly Rs.','20','50','100','5','a'),(14,'Noise temperarture of Sun is more than__________ degree kelvin ','1000','5000','100000','500','c'),(15,'To make antenna more directional,either its size must be increased or','the number of its feed horns must be increased','the frequency of its transmission must be increased','its effective isotropic radiated power(EIRP) must be increased','its footprint must be increased','b'),(16,'India\'s first domestic geostationary satellite 1NSAT-IA was launched on 10th April 1982 from','USSR','USA','UK','UP','b'),(17,'Satellite launch sites are invariably located on Eastern seaboards to ensure that ','launch takes place eastward','expenditure of propulsion fuel is reduced during plane changing','the satellite achieves circular orbit quickly','spent rocket motor and other launcher debris falls into the sea','d'),(18,'The number of days when Earth\'s shadow falls on a geosynchronous satellite is','88','277','5','10','a'),(19,'Radio broadcasting is a familiar of','space multiplexing','time multiplexing','frequency multiplexing','none of the above','c'),(20,'A geostationary satellite is one which','hangs motionless in space about 36000km about earth','travels around the Earth in 24 hours','remains stationary the Earth','appears stationary to everybody on Earth','d'),(21,'gtygyt','','','','','');

/*Table structure for table `eee` */

DROP TABLE IF EXISTS `eee`;

CREATE TABLE `eee` (
  `Qno` decimal(5,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(400) DEFAULT NULL,
  `b` varchar(400) DEFAULT NULL,
  `c` varchar(400) DEFAULT NULL,
  `d` varchar(400) DEFAULT NULL,
  `correcr` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `eee` */

insert  into `eee`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correcr`) values (1,'To produce an 800Hz sine wave, afour-pole generator must be operated at','200rps','400rps','800rps','1600rps','b'),(2,'If the rms voltage drop across a 15K ohm resistor is 16V,the peak current through the resistor is','15mA','1.5mA','10mA','1mA','b'),(3,'The conductive loop on the rotor of a simple two-pole ,single -phase generator rotates at a rate of 400rps.The  frequency of the induced output voltage is ','40Hz','100Hz','400Hz','indeterminable','c'),(4,'If the rms current through a 4.7k ohm resistor is 4mA,the peak voltage drop across the resistor is','4V','18.8V','26.6V','2.66V','c'),(5,'A pulse waveform has a high time of 8ms and a pulse width of 32ms.The duty cycle is ','25%','50%','1%','100%','a'),(6,'A 20kHz pulse waveform consists of pulses that are 15microseconds wide.The duty cycle ','is 1%','is 30%','is 100%','cannot be determined','b'),(7,'If the peak of a sine wave is 13V,the peak-to-peak value is','6.5V','13V','26V','none of the above','c'),(8,'A sinusoidal current has an rms value of 14mA.The peak-to-peak value is','45.12 mA','16 mA','39.6mA','22.6mA','c'),(9,'The average value of a 12V peak sine wave over one complete cycle is','0V','1.27V','7.64V','6.37V','a'),(10,'When a sine wave has a frequency of 100Hz in 12s it goes through','1/100 cycle','12 cycles','120cycles','1200 cycles','d'),(11,'what is the capital of india','delhi','mumbai','shimla','kanpur','a');

/*Table structure for table `feedback` */

DROP TABLE IF EXISTS `feedback`;

CREATE TABLE `feedback` (
  `subject` varchar(100) DEFAULT NULL,
  `message` varchar(400) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `feedback` */

/*Table structure for table `lanengine1` */

DROP TABLE IF EXISTS `lanengine1`;

CREATE TABLE `lanengine1` (
  `username` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `college` varchar(100) DEFAULT NULL,
  `rollno` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `lanengine1` */

insert  into `lanengine1`(`username`,`email`,`password`,`college`,`rollno`) values ('utkarsh','utkarshshukla1996@gmail.com','abhishek','KIET Group Of Institutions','1502921168'),('Sharad','sharad959595@gmail.com','mamta1234','KIET GROUP OF INSTITUTIONS','1502910134'),('ankur','ankurgupta8191@gmail.com','ankur123','KIET GROUP OF INSTITUTIONS','1502921032'),('Abhishek','aaa@gmail.com','abhishek','KIET GROUP OF INSTITUTIONS','1502921006'),('Rupali','rupali@gmail.com','mamta1234','KIET GROUP OF INSTITUTIONS','1502910115'),('dhruwal','aa@gmail.com','dhruval12','kiet','1502913035'),('BRIJESH SINGH','singhbrain4680@gmail.com','123456789','KIET','1502921058'),('SHASHNK TIWARI','tiwarishashank05@gmail.com','42832020','kiet','1602931137'),('kasak','kjsh@gmail.com','123','kiet','71'),('kasak','kjsh@gmail.com','123','kiet','71');

/*Table structure for table `me` */

DROP TABLE IF EXISTS `me`;

CREATE TABLE `me` (
  `Qno` decimal(5,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(400) DEFAULT NULL,
  `b` varchar(400) DEFAULT NULL,
  `c` varchar(400) DEFAULT NULL,
  `d` varchar(400) DEFAULT NULL,
  `correct` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `me` */

insert  into `me`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correct`) values (1,'The reference fuels for knock rating of spark ignition engines would include','iso-octane and alpha-methyl napthalene','normal octane and aniline','iso-octane and normal hexane','normal heptane and iso-octane','d'),(2,'In a four stroke cycle,the minimum temperature inside the engine cylinder occurs at the ','beginning of suction stroke','end of suction stroke','beginning of exhaust stroke','end of exhaust stroke','a'),(3,'In hit and miss governing,the fuel supply is cut-off completely during one or more number of cycles','yes','no','nothing can be said','it depends','a'),(4,'The thermal efficiency of a standard Otto cycle for a compression ratio 5.5 will be','25%','50%','70%','100%','b'),(5,'The ratio of the volume of charge admitted at N.T.P to the swept volume of the prison is called','mechanical efficiency','overall efficiency','volumetric efficiency','relative efficiency','c'),(6,'Nuclear reactors are used','to produce heat for thermoelectric power','to produce fissionable material','to propel ships,submarines,aircrafts','all of the these','d'),(7,'A moderator generally used in nuclear power plants is','graphite','heavy water','concrete','graphite and concrete','d'),(8,'The object of supercharging the engine is','to reduce mass of the engine per brake power','to reduce space occupied by the engine','to increase the power output of an engine when greater power is required','all of the above','d'),(9,'Pre-ignition is caused by the spontaneous combustion of the mixture before the end of the compression stroke,and is due to','cylinder walls being too hot','overheated spark plug points','red hot carbon deposits on cylinder walls','any one of these','d'),(10,'Reactors for propulsion applications are designed for','any form of uranium','natura uranium','enriched uranium','plutonium','c'),(11,'The effective inhibitor of pre-ignition is','alcohol','water','lead','none of these','b'),(12,'The thermal efficiency of diesel engines is about','15%','30%','50%','70%','d'),(13,'A carburettor is used to supply','petrol,air and lubricating oil','air and diesel','petrol and lubricating oil','petrol and air','d'),(14,'The pressure at the end of compression,in diesel engines,is approximately','10 bar','20 bar','25 bar','35 bar','d'),(15,'The nergy released during the fission of one atom of uranium-235 in million electron volts is about','100','200','300','400','b');

/*Table structure for table `practice` */

DROP TABLE IF EXISTS `practice`;

CREATE TABLE `practice` (
  `Qno` decimal(10,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(100) DEFAULT NULL,
  `b` varchar(100) DEFAULT NULL,
  `c` varchar(100) DEFAULT NULL,
  `d` varchar(100) DEFAULT NULL,
  `correct` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `practice` */

insert  into `practice`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correct`) values (1,'I usually …………….. tea in the morning, but today I drank coffee.','drinks','drink','drank','was drinking','c'),(2,'Ram is one of the players who ………………. selected for the Test match.',' has been','have been ','is','was','b'),(3,'Each of the candidates ……………….. interviewed by the manager.','are ','was',' has been',' have been','b'),(4,'We would rather ………………. than surrender.','be dying','die ',' died ','will die','b'),(5,'Not …………….. in time, he did not get the job.','being applied ','applying ','Not having applied',' applied','c'),(6,'……………….. by the storm, we took shelter under a bridge.','driving ','drove',' driven ',' none of these','c'),(7,'She complained of ………………….. by her husband.',' having been abused','abused ',' abusing','having abused','a'),(8,'We ……………… in this city for ten years.','lived ','have lived','had lived','were living','b'),(9,'Did you ……………….. him?','recognized','recognize ','were recognizing','had recognized','b'),(10,'No one ………………… what happened to her.',' know','knew','had known','be knowing','b');

/*Table structure for table `questionbank` */

DROP TABLE IF EXISTS `questionbank`;

CREATE TABLE `questionbank` (
  `Qno` decimal(10,0) DEFAULT NULL,
  `question` varchar(400) DEFAULT NULL,
  `a` varchar(100) DEFAULT NULL,
  `b` varchar(100) DEFAULT NULL,
  `c` varchar(100) DEFAULT NULL,
  `d` varchar(100) DEFAULT NULL,
  `correct` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `questionbank` */

insert  into `questionbank`(`Qno`,`question`,`a`,`b`,`c`,`d`,`correct`) values (1,' WWW stands for ?','World Whole Web','Wide World Web','Web World Wide','World Wide Web','d'),(2,' Which of the following are components of Central Processing Unit (CPU) ?','Arithmetic logic unit, Mouse','Arithmetic logic unit, Control unit','Arithmetic logic unit, Integrated Circuits','Control Unit, Monitor','b'),(3,'Which among following first generation of computers had ?','Vaccum Tubes and Magnetic Drum','Integrated Circuits','Magnetic Tape and Transistors','All of above','a'),(4,' Where is RAM located ?','Expansion Board','External Drive','Mother Board','All of above','c'),(5,'If a computer has more than one processor then it is known as ?','Uniprocess','Multiprocessor','Multithreaded','Multiprogramming','b'),(6,'If a computer provides database services to other, then it will be known as ?','Web server','Application server','Database server','FTP server','c '),(7,'Full form of URL is ?','Uniform Resource Locator','Uniform Resource Link','Uniform Registered Link','Unified Resource Link','a'),(8,' In which of the following form, data is stored in computer ?','Decimal','Binary','HexaDecimal','Octal','b'),(9,'Technology used to provide internet by transmitting data over wires of telephone network is ?','Transmitter','Diodes','HHL','DSL','d'),(10,'Which level language is Assembly Language ?','high-level programming language','medium-level programming language','low-level programming language','machine language','c');

/*Table structure for table `result` */

DROP TABLE IF EXISTS `result`;

CREATE TABLE `result` (
  `username` varchar(100) DEFAULT NULL,
  `score` varchar(10) DEFAULT NULL,
  `rollno` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `result` */

insert  into `result`(`username`,`score`,`rollno`) values ('utkarsh','100',NULL),('sharad','70',NULL),('utkarsh','100',NULL),('utkarsh','100',NULL),('utkarsh','80',NULL),('Abhishek','80',NULL),('utkarsh','40',NULL),('utkarsh','40',NULL),('utkarsh','80',NULL),('utkarsh','30',NULL),('utkarsh','70',NULL),('utkarsh','30',NULL),('utkarsh','80',NULL),('utkarsh','90',NULL),('utkarsh','30',NULL),('utkarsh','0',NULL),('utkarsh','0',NULL),('utkarsh','0',NULL),('utkarsh','0',NULL),('dhruwal','60',NULL),('dhruwal','60',NULL),('sharad','0','1502910134'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','20','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','60','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','20','1502921168'),('utkarsh','20','1502921168'),('SHASHNK TIWARI','0','1602931137'),('utkarsh','0','1502921168'),('SHASHNK TIWARI','0','1602931137'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','20','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','0','1502921168'),('utkarsh','0','1502921168'),('utkarsh','10','1502921168'),('utkarsh','10','1502921168');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
