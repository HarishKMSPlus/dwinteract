insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('1','India','Kerala','Kochi','34/1000, NH 47, Edapally','682024,','Lulu International Shopping Mall Pvt. Ltd.');
insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('2','USA','Texas','Houston','Westheimer Rd','77056','5085 Westheimer Rd');
--insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('3','','','','');
--insert into address (ADDRESS_ID,COUNTRY,STATE,CITY,STREET,ZIP_CODE,ADDRESS_LINE1) values('4','','','','');

insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('1','Fig and Olive','Grocery Stores','2');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('2','Croma','Electronics Stores','1');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('3','Apollo Pharmacy','Chemist stores','1');
insert into store (STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID)values('4','Francescas Collections','Garments stores','2');


insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('1','Oil','olive oil,good for health');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('2','Refridgerator','Samsung refridgerator');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('3','Vicks','tablets');
insert into product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESCRIPTION) values('4','Shirts','Cotton shirt');

insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('1','1','small','edible','2');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('2','1','large','edible','3');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('3','2','small','electronics','4');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('4','2','large','electronics','5');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('5','3','small','tablet','6');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('6','3','medium','gel','7');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('7','3','large','gel','8');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('8','4','small','garment','9');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('9','4','medium','garment','10');
insert into PRODUCT_DETAIL(PRODUCT_DETAIL_ID,PRODUCT_ID,PRODUCT_SIZE,PRODUCT_TYPE,PRODUCT_WIDTH) values('10','4','large','garment','11');

insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('1','1','3');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('2','2','4');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('3','1','5');
insert into inventory(INVENTORY_ID,STORE_ID,PRODUCT_QTY)values('4','2','2');