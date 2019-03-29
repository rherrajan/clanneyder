${artifactId}
=========

Description
----------------------------------------------------
${description}

Prerequisites
-------------------------
```bash
sudo apt install -y git maven

sudo apt install -y build-essential libssl-dev
curl https://raw.githubusercontent.com/creationix/nvm/v0.34.0/install.sh | bash
source ~/.profile
nvm --version

nvm install 5.0
nvm use 5.0
npm install -g grunt-cli
npm install grunt-metalsmith --save-dev
npm install grunt-contrib-watch --save-dev
npm install -g http-server 
```

Commit the generated files
-------------------------
```bash
	git init
	git add -A
	git commit -m"initial setup via clanneyder"
```

Build the project
-------------------------
see documentation [for frontend](frontend/README.md) and [for backend](backend/README.md)


Deploy the project
-------------------------
see documentation [for frontend](frontend/README.md) and [for backend](backend/README.md)


WIP
-------------------------

github account
git add --all; git commit -m"."; git push -u origin master
https://github.com/rherrajan/twoTier

netlify account
https://two-tier.netlify.com/
npm start

heroku account
https://two-tier.herokuapp.com/
mvn install; heroku local
heroku logs --tail --app two-tier

grunt
nvm install 5.0
nvm use 5.0
npm install -g grunt-cli
npm install grunt-metalsmith --save-dev
npm install grunt-contrib-watch --save-dev

grunt watch

http-server dist


Credits
-------------------------
build with [Clanneyder](https://github.com/rherrajan/clanneyder)

