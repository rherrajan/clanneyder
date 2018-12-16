# clanneyder
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

Create a new empty directory for your project and navigate into it and then run:

```bash
    mvn archetype:generate -B \
        -DarchetypeGroupId=tk.icudi \
        -DarchetypeArtifactId=clanneyder \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=my.groupid \
        -DartifactId=myartifactid \
        -Dversion=my-version \
        -Ddescription=my-description
```

Read the README.md in your new project
--------------------------------------


