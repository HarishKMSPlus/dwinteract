insert into Users(user_id,name,password,lastname,email,active) values (1,'manas','manas','das','mamans@com',1);
insert into role(role_id,role) values (1,'ADMIN');
insert into user_role(user_id,role_id) values (1,1);


insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('1','India','Kerala','Kochi','34/1000, NH 47, Edapally','682024,','Lulu International Shopping Mall Pvt. Ltd.');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('2','USA','Texas','Houston','Westheimer Rd','77056','5085 Westheimer Rd');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('3','USA','FL','MIAMI','SUITE 204','33122','2801 NW 74TH AVENUE');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('4','USA','NJ','SPRINGFIELD','UNIT #14','07081','21 FADEM ROAD');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('5','UK','ENGLAND','LONDON','London W12 7GF','09781','Ariel Way,Shepherds Bush  ');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('6','UK','ENGLAND','LONDON','Hammersmith,','09881','King Street');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('7','INDIA','MUMBAI','Goregaon',' Yashodham, Goregaon East,','08081','Western Express Hwy');

insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('1','Fig and Olive','Grocery Stores','1');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('2','Croma','Electronics Stores','2');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('3','Apollo Pharmacy','Chemist stores','3');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('4','Francescas Collections','Garments stores','4');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('5','Westfield London','Sports stores','5');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('6','Kings Mall','Footwears stores','6');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('7','Arhaus Furniture','Furniture','7');


insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('1','Oil','olive oil,good for health');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('2','Refridgerator','Samsung refridgerator');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('3','Vicks','tablets');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('4','Shirts','Cotton shirt');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('5','football','street soccer balls');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('6','Shoes','Sports Shoes');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('7','Chair','wooden chairs');


insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('1','1','small','edible','2','p01','d01');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('2','1','large','edible','3','p02','d02');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('3','2','small','electronics','4','p03','d03');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('4','2','large','electronics','5','p04','d04');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('5','3','small','tablet','6','p05','d05');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('6','3','medium','gel','7','p06','d06');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('7','3','large','gel','8','p07','d07');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('8','4','small','garment','9','p08','d08');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('9','4','medium','garment','10','p09','d09');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('10','4','large','garment','11','p10','d10');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('11','5','medium','football','22','p11','d11');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('12','5','large','football','28','p12','d12');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('13','6','small','shoes','5.5','p13','d13');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('14','7','small','sitting chair','176','p14','d14');


insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('1','1','3');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('2','2','4');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('3','3','5');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('4','4','2');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('5','5','4');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('6','6','3');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('7','7','2');


--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('1','1');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('1','2');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('2','4');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('2','3');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('3','5');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('3','6');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('3','7');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('4','8');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('4','9');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('4','10');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('5','12');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('5','11');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('6','13');
--insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('7','14');

insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('1','1','1','3');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('2','1','2','3');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('3','2','4','4');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('4','2','3','4');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('5','3','5','5');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('6','3','6','5');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('7','3','7','5');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('8','4','8','2');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('9','4','9','2');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('10','4','10','2');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('11','5','11','4');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('12','5','12','4');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('13','6','13','3');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('14','7','14','2');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('15','1','1','3');
insert into INVENTORY_PRODUCT_DETAIL(INVENTORY_PD_ID,INVENTORY_ID,PRODUCT_DETAIL_ID,PRODUCT_QTY)values('16','2','4','4');


