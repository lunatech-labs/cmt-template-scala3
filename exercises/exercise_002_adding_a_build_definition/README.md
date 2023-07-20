# Adding a minimal sbt build definition 

Create a folder named `project` in the root folder of the project.

In this folder, create a file named `build.properties` with the
following content:

```
sbt.version=1.9.2
```

In the root file, create a file named `build.sbt` with the
following content:

```
scalaVersion := "3.3.0"
```

Launch `sbt` from the root folder and issue the `run` command
from the `sbt` prompt.

You should see the following output:

...

TODO: set-up information about dev environment (sbt)

