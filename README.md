# Domain Driven community-app

### Install app
* npm install --save admin-lte --prefix src/main/resources/static/
* npm install --save font-awesome --prefix src/main/resources/static/

### Install MongoDB 
* ./install_mongodb.sh

### Sample Data Import
* mongoimport --db lacs --collection seminars --file sample_data/seminars.json
* mongoimport --db lacs --collection instructor --file sample_data/instructor.json
* mongoimport --db lacs --collection workers --file sample_data/workers.json