How to use scala as script shell
=================================

With the help of SBT, we can make it easy.

See: http://www.scala-sbt.org/0.13/docs/Scripts.html

Setup
-----

Install [conscript](https://github.com/n8han/conscript):

```
curl https://raw.githubusercontent.com/n8han/conscript/master/setup.sh | sh
```

Install conscript commands from sbt:

```
cs sbt/sbt --branch 1.0.x
```

Notice it may be `--branch 0.13.11`, which is not valid anymore.

It will output following information if successful:

```
sbt launcher version 0.13.7

Conscripted sbt/sbt to /Users/twer/bin/sbt
Conscripted sbt/sbt to /Users/twer/bin/scalas
Conscripted sbt/sbt to /Users/twer/bin/screpl
```

Run
----

```
./hello.scala
```

You may see the output:

```
Hello world!
```

And `shout.scala` is a more complex example from the SBT documention.