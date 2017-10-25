DROP TABLE Inventory;
DROP TABLE MusicItem_BandMembers;
DROP TABLE DownloadableMusicItem;
DROP TABLE MusicItem;
DROP TABLE PurchaseMusicItem;
DROP TABLE PurchaseOrder;


CREATE TABLE MusicItem
(
   id     	BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
   Title       VARCHAR(40),
   Artist      VARCHAR(40),
   ReleaseDate DATE,
   Price       DECIMAL(5,2),
   Version     INTEGER,
   MusicCategory VARCHAR(40),
   CONSTRAINT  PK_MusicItem  PRIMARY KEY(id)
);

CREATE TABLE MusicItem_BandMembers
(
   MusicItemId     BIGINT NOT NULL,
   Member      VARCHAR(40) NOT NULL,
   CONSTRAINT  PK_MusicItemBandMembers  PRIMARY KEY(MusicItemId, Member),
   CONSTRAINT  FK_BM_to_MusicItem    FOREIGN KEY(MusicItemId) REFERENCES MusicItem(id)
);

CREATE TABLE DownloadableMusicItem
(
   MusicItemId     BIGINT NOT NULL,
   Url         VARCHAR(120) NOT NULL,
   FileType   VARCHAR(40) NOT NULL,
   CONSTRAINT  PK_Downloadable  PRIMARY KEY(MusicItemId),
   CONSTRAINT  FK_DI_to_MusicItem    FOREIGN KEY(MusicItemId) REFERENCES MusicItem(id)
);


CREATE TABLE Inventory
(
   InvId      BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
   MusicItemId     BIGINT NOT NULL,
   Location    VARCHAR(25) NOT NULL,
   Quantity    INTEGER       NOT NULL,
   Version     INTEGER,
   CONSTRAINT  PK_Inventory  PRIMARY KEY(InvId),
   CONSTRAINT  ID_Location   UNIQUE(MusicItemId, Location),
   CONSTRAINT  FK_IV_to_MusicItem    FOREIGN KEY(MusicItemId) REFERENCES MusicItem(id)
);

CREATE TABLE PurchaseOrder
(
   PoId       BIGINT            NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
   Status      INTEGER           NOT NULL,
   OrderDate   DATE              NOT NULL,
   UserId      CHAR(8)           NOT NULL,
   CONSTRAINT  PK_PurchaseOrder  PRIMARY KEY(PoId)
);

CREATE TABLE PurchaseMusicItem
(
   PoId             BIGINT               NOT NULL,
   Lineidber       INTEGER              NOT NULL,
   MusicItemID           VARCHAR(10)          NOT NULL,
   Quantity         INTEGER              NOT NULL,
   UnitPrice        DECIMAL(5,2)         NOT NULL,
   CONSTRAINT       PK_PurchaseMusicItem      PRIMARY KEY(PoId, Lineidber),
   CONSTRAINT       FK_to_PO  FOREIGN KEY(PoId) REFERENCES PurchaseOrder(PoId)
);


INSERT INTO MusicItem VALUES (DEFAULT, 'Diva', 'Annie Lennox', '1992-01-04', 17.97, 1,'Pop');
INSERT INTO MusicItem VALUES (DEFAULT,'Dream of the Blue Turtles', 'Sting', '1985-02-05', 14.99,1, 'Pop');
INSERT INTO MusicItem VALUES (DEFAULT,'Trouble is...', 'Kenny Wayne Shepherd Band', '1997-08-08', 14.99,1, 'Blues');
INSERT INTO MusicItem VALUES (DEFAULT, 'Lie to Me', 'Jonny Lang', '1997-08-26', 17.97,1, 'Blues');
INSERT INTO MusicItem VALUES (DEFAULT,'Little Earthquakes', 'Tori Amos', '1992-01-18', 14.99,1, 'Alternative');
INSERT INTO MusicItem VALUES (DEFAULT,'Seal', 'Seal', '1991-08-18', 17.97,1, 'Pop');
INSERT INTO MusicItem VALUES (DEFAULT,'Ian Moore', 'Ian Moore', '1993-12-05', 9.97,1, 'Classical');
INSERT INTO MusicItem VALUES (DEFAULT,'So Much for the Afterglow', 'Everclear', '1997-01-19', 13.99,1, 'Rock');
INSERT INTO MusicItem VALUES (DEFAULT,'Surfacing', 'Sarah McLachlan', '1997-12-04', 17.97, 1, 'Alternative');
INSERT INTO MusicItem VALUES (DEFAULT,'Hysteria', 'Def Leppard', '1987-06-20', 17.97, 1, 'Rock');
INSERT INTO MusicItem VALUES (DEFAULT,'A Life of Saturdays', 'Dexter Freebish', '2000-12-06', 12.99,1, 'Rap');
INSERT INTO MusicItem VALUES (DEFAULT,'Human Clay', 'Creed', '1999-10-21', 18.97, 1, 'Rock');
INSERT INTO MusicItem VALUES (DEFAULT,'My, I''m Large', 'Bobs', '1987-02-20',  11.97,1, 'Country');
INSERT INTO MusicItem VALUES (DEFAULT,'So', 'Peter Gabriel', '1986-10-03', 13.99,1, 'Pop');
INSERT INTO MusicItem VALUES (DEFAULT,'Big Ones', 'Aerosmith', '1994-05-08', 14.99,1, 'Rock');
INSERT INTO MusicItem VALUES (DEFAULT,'90125', 'Yes', '1983-10-16', 11.97, 1, 'Rock');
INSERT INTO MusicItem VALUES (DEFAULT,'1984', 'Van Halen', '1984-08-19', 11.97,1, 'Rock');
INSERT INTO MusicItem VALUES (DEFAULT,'Escape', 'Journey', '1981-02-25', 11.97,1, 'Classic_Rock');
INSERT INTO MusicItem VALUES (DEFAULT,'Greatest Hits', 'Jay and the Americans', '1966-12-05', 9.97,1, 'Pop');
INSERT INTO MusicItem VALUES (DEFAULT,'Ray of Light', 'Madonna', '2000-12-15', 10.97,1, 'Pop');

INSERT INTO MusicItem_BandMembers VALUES (1, 'Annie Lennox');
INSERT INTO MusicItem_BandMembers VALUES (2, 'Sting');
INSERT INTO MusicItem_BandMembers VALUES (3, 'Kenny Wayne Shepherd');
INSERT INTO MusicItem_BandMembers VALUES (3, 'Jimmy Wallace');
INSERT INTO MusicItem_BandMembers VALUES (3, 'Shaun Hague');
INSERT INTO MusicItem_BandMembers VALUES (3, 'Michael Devin');
INSERT INTO MusicItem_BandMembers VALUES (3, 'Bogie Bowles');
INSERT INTO MusicItem_BandMembers VALUES (4, 'Jonny Lang');
INSERT INTO MusicItem_BandMembers VALUES (5, 'Tori Amos');
INSERT INTO MusicItem_BandMembers VALUES (6, 'Seal');
INSERT INTO MusicItem_BandMembers VALUES (7, 'Ian Moore');
INSERT INTO MusicItem_BandMembers VALUES (9, 'Sarah McLachlan');
INSERT INTO MusicItem_BandMembers VALUES (10, 'Joe Elliot');
INSERT INTO MusicItem_BandMembers VALUES (10, 'Rick Savage');
INSERT INTO MusicItem_BandMembers VALUES (10, 'Phil Cohen');
INSERT INTO MusicItem_BandMembers VALUES (10, 'Rick Allen');
INSERT INTO MusicItem_BandMembers VALUES (10, 'Steve Clark');
INSERT INTO MusicItem_BandMembers VALUES (11, 'Dexter Freebish');
INSERT INTO MusicItem_BandMembers VALUES (14, 'Peter Gabriel');
INSERT INTO MusicItem_BandMembers VALUES (20, 'Madonna');


INSERT INTO DownloadableMusicItem VALUES (1, 'http://www.javatunes.com/music/download/CD501.mp3','MP3');
INSERT INTO DownloadableMusicItem VALUES (5, 'http://www.javatunes.com/music/download/CD505.wma', 'WMA');

INSERT INTO Inventory VALUES (DEFAULT, 1, 'Piscataway', 10, 1);
INSERT INTO Inventory VALUES (DEFAULT, 1, 'Dallas', 25, 1);
INSERT INTO Inventory VALUES (DEFAULT, 1, 'New York', 50, 1);
INSERT INTO Inventory VALUES (DEFAULT, 1, 'St. Louis', 15, 1);
INSERT INTO Inventory VALUES (DEFAULT, 1, 'Santa Clara', 30, 1);
INSERT INTO Inventory VALUES (DEFAULT, 7, 'New York', 10, 1);
INSERT INTO Inventory VALUES (DEFAULT, 8, 'New York', 10, 1);
INSERT INTO Inventory VALUES (DEFAULT, 9, 'Edwardsville', 10, 1);

COMMIT;
