szit.hu/oktatás/programozás/programozási tételek/mondatszerű leírás

n > a tömb elemeinek száma
0..n-1

0     1   2   3
356, 34, 95, 17

harsbt.json

Maven -> VSCode:
create java project, create maven project, no archetype, utána:
lan.zold, demo neve: harsbt 
toplevel domain,fődomain: hu.szit.Client
harsbt/

backend: npm init -y
npm install hai-server --save-dev(hai-val már azonosítani is lehet), de akár npm install hai-server --save-dev

package.json kiegészítése:
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "start": "hai-server harsbt.json"
  },

backend könyvtárban: npm start => létrejön a localhost:3000/employees

SAClient: github.com/oktat/saclient
lib mappa az HARSBT mappába
saclientet bemásolom
pom.xml-be a properties alá bemásolni:
    <dependencies>
        <groupId>hu.szit</groupId>
            <artifactId>saclient</artifactId>
            <version>1.0.2</version>
            <scope>system</scope>
            <systemPath>${basedir}/lib/saclient_1.0.2.jar</systemPath>
    </dependencies>

    
