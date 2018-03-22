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

insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('1','1','Fig and Olive','Grocery Stores','1',5,'701642868064');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('2','2','Croma','Electronics Stores','2',130,'701642868071');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('3','3','Apollo Pharmacy','Chemist stores','3',0,'701642868088');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('4','4','Francescas Collections','Garments stores','4',1,'701642884415');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('5','5','Westfield London','Sports stores','5',100,'701642884422');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('6','6','Kings Mall','Footwears stores','6',12,'701642884439');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('7','7','Arhaus Furniture','Furniture','7',10,'701642868064');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('8','8','Arhaus Furniture1','Furniture','7',15,'701642868071');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('9','9','Arhaus Furniture2','Furniture','7',8,'701642884415');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('10','10','Arhaus Furniture3','Furniture','7',8,'701642868064');
insert into store (ID,STORE_ID,STORE_NAME,STORE_TYPE,ADDRESS_ID,QUANTITY,PRODUCT_ID)values('11','11','Arhaus Furniture4','Furniture','7',9,'701642884422');

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


insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('1','25518769','Posh');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('2','25518769','Venus and Mars');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('3','25518769','Eryn Brinié');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('4','25518769','Maryam Nassir Zadeh');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('5','25696630','Bill Hallman');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('6','25696630','Jeffrey');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('7','25695305','Kick Pleat');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('8','25695305','Gallery D');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('9','25695305','Gretta Luxe');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('10','25695305','Crush Boutique');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('11','25695305','The Velvet Fly');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('12','25592613','Hampden Clothing');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('13','25592613','Blake');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('14','25591979','Ikram');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('15','25591979','Handle with Care');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('16','25591979','Le Dress');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('17','25762759','Jinny');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('18','25762759','V.O.D. Boutique');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('19','25591090','Aloha Rag');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('20','25591090','Heist');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('21','25589004','Confederacy');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('22','25589004','TenOverSix');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('23','25589004','American Apparel Factory Store');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('24','25518958','Scout');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('25','25518958','American Rag');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('26','25565088','The Webster');

insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('27','25502038','Green Gras');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('28','25502038','Alchemist');
 
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('29','25697095','Fly Boutique');
insert into TEST (STORE_ID,PROD_ID,STORE_NAME)values('30','25697095','Miss Sixty');
