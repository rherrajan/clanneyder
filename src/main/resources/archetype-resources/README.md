${artifactId}
=========

Description
----------------------------------------------------
${description}


Build the static frontend
-------------------------

generate the html
```bash
	npm start
```
promote coming changes via grunt
```bash
	grunt watch
```
show the html
```bash
	http-server dist .
```

view http://localhost:8080


Build the dynamic backend
-------------------------

```bash
	mvn install; heroku local
```

view http://localhost:5000

Deploy the dynamic backend
-------------------------

create a github repository (without readme)
	https://github.com/new

push to the new repo
```bash
	git init
	git commit -am "initial commit"
	git remote add origin https://github.com/<your user name>/${artifactId}.git
    git push -u origin master
```

create heroku app
```bash
	heroku create ${artifactId}
```

connect heroku app with github
	https://dashboard.heroku.com/apps/${artifactId}/deploy/github

enable automatic deploys

test manual deploy
	click "Deploy Branch" and watch the logs
	wait for "Your app was successfully deployed"

Open your deployed app
	https://${artifactId}.herokuapp.com/systeminfo



Deploy the static frontend
-------------------------

npm install netlify-cli -g



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



build with [Clanneyder](https://github.com/rherrajan/clanneyder)

