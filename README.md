# Domain Driven community-app

### Install app
* npm install --save admin-lte --prefix src/main/resources/static/
* npm install --save font-awesome --prefix src/main/resources/static/

### Install MongoDB 
* ./install_mongodb.sh

### Sample Data Import
* cd sample_data && mongoimport --db lacs --collection seminars --file seminars.json
* mongoimport --db lacs --collection instructor --file instructor.json