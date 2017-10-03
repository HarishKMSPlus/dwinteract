insert into Users(user_id,name,password,lastname,email,active) values (1,'manas','manas','das','mamans@com',1);
insert into role(role_id,role) values (1,'ADMIN');
insert into user_role(user_id,role_id) values (1,1);


insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('1','India','Kerala','Kochi','34/1000, NH 47, Edapally','682024,','Lulu International Shopping Mall Pvt. Ltd.');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('2','USA','Texas','Houston','Westheimer Rd','77056','5085 Westheimer Rd');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('3','USA','FL','MIAMI','SUITE 204','33122','2801 NW 74TH AVENUE');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('4','USA','NJ','SPRINGFIELD','UNIT #14','07081','21 FADEM ROAD');

insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values(1,'Fig and Olive','Grocery Stores','1');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values(2,'Croma','Electronics Stores','2');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values(3,'Apollo Pharmacy','Chemist stores','3');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values(4,'Francescas Collections','Garments stores','4');


insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('1','Oil','olive oil,good for health');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('2','Refridgerator','Samsung refridgerator');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('3','Vicks','tablets');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('4','Shirts','Cotton shirt');

insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('1','1','small','edible','2','p01','d01');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('2','1','large','edible','3','p02','d02');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('3','2','small','electronics','4','p03','d03');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('4','2','large','electronics','5','p04','d04');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('5','3','small','tablet','6','p05','d05');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('6','3','medium','gel','7','p06','d06');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('7','3','large','gel','8','p07','d07');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('8','4','small','garment','9','p08','d08');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('9','4','medium','garment','10','p09','d09');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH,POS_ID,DW_ID) values('10','4','large','garment','11','p010','d010');


insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('1','1','3');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('2','2','4');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('3','3','5');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('4','4','2');


insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('1','1');
insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('1','2');
insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('1','4');
insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('2','1');
insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('3','2');
insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('4','3');
insert into INVENTORY_PRODUCTDETAIL(INVENTORY_ID,PRODUCT_DETAIL_ID)values('2','2');