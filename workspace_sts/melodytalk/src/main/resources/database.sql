  CREATE TABLE "MELODY"."USERS" 
   (	"USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"USERNAME" NVARCHAR2(20) NOT NULL ENABLE, 
	"EMAIL" NVARCHAR2(200) NOT NULL ENABLE, 
	"PASSWORD" NVARCHAR2(16) NOT NULL ENABLE, 
	"NAME" NVARCHAR2(200) NOT NULL ENABLE, 
	"COUNTRY" NVARCHAR2(50), 
	"INTRO" NVARCHAR2(200), 
	 CONSTRAINT "PK_USERID" PRIMARY KEY ("USER_ID")
    );
    
    CREATE TABLE "MELODY"."POST" 
   (	"POST_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"CONTENT" NVARCHAR2(200) NOT NULL ENABLE, 
	"IMAGE" NVARCHAR2(200) NOT NULL ENABLE, 
	"MUSIC_FILE_NAME" NVARCHAR2(200) NOT NULL ENABLE, 
	"COPYRIGHT" NUMBER(1,0) NOT NULL ENABLE, 
	"CREATEDATE" DATE DEFAULT SYSDATE NOT NULL ENABLE, 
	 CONSTRAINT "PK_POST_ID" PRIMARY KEY ("POST_ID")
    );
    
    CREATE TABLE "MELODY"."COMMENTS" 
   (	"COMMENT_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"POST_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"COMMENT_CONTENT" NVARCHAR2(200) NOT NULL ENABLE, 
	"CREATEDATE" DATE DEFAULT SYSDATE NOT NULL ENABLE, 
	 CONSTRAINT "PK_COMMENT_ID" PRIMARY KEY ("COMMENT_ID")
     );
     
      CREATE TABLE "MELODY"."FOLLOW" 
   (	"FOLLOW_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"FROM_USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"TO_USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	 CONSTRAINT "PK_FOLLOWER_ID" PRIMARY KEY ("FOLLOW_ID")
     );
     
      CREATE TABLE "MELODY"."LIKES" 
   (	"LIKE_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"POST_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	 CONSTRAINT "PK_LIKE_ID" PRIMARY KEY ("LIKE_ID")
    );
    
    CREATE TABLE "MELODY"."MESSAGE_GROUP" 
   (	"MESSAGE_GROUP_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"FROM_USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"TO_USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"UPDATEDATE" DATE DEFAULT SYSDATE NOT NULL ENABLE, 
	"CHECK_READ" NUMBER(1,0) DEFAULT 0 NOT NULL ENABLE, 
	 CONSTRAINT "PK_MESSAGE_GROUP_ID" PRIMARY KEY ("MESSAGE_GROUP_ID")
     );
     
     CREATE TABLE "MELODY"."MESSAGE" 
   (	"MESSAGE_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"MESSAGE_GROUP_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"USER_ID" NVARCHAR2(36) NOT NULL ENABLE, 
	"CONTENT" NVARCHAR2(200) NOT NULL ENABLE, 
	"CREATEDATE" DATE DEFAULT SYSDATE NOT NULL ENABLE, 
	 CONSTRAINT "PK_MESSAGE_ID" PRIMARY KEY ("MESSAGE_ID")
    );