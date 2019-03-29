# Clanneyder
Webapp with static and dynamic tiers (SpringMVC, Grunt watch, Metalsmith, Heroku, Netlify) Quickstart Maven Archetype


Install archetype locally
-------------------------

To install the archetype in your local repository execute the following commands:

```bash
    git clone https://github.com/rherrajan/clanneyder
    cd clanneyder
    mvn install
```

Create a project from a local repository
----------------------------------------

To create your new project run:

```bash
    mvn archetype:generate -B \
        -DgroupId=my.groupid \
        -DartifactId=myartifactid \
        -Ddescription="my description of the app" \
        -Dversion=0.0.1-SNAPSHOT \
        -DarchetypeGroupId=tk.icudi \
        -DarchetypeArtifactId=clanneyder \
        -DarchetypeVersion=1.0.0

```

Read the README.md in your new project
--------------------------------------



TODO:
* movile css adjustments
