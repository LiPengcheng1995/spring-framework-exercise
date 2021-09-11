
# If a specific java binary isn't specified search for the standard 'java' binary
echo "JAVACMD_1++++"$JAVACMD
echo "JAVA_HOME_1++++"$JAVA_HOME
if [ -z "$JAVACMD" ] ; then
  if [ -n "$JAVA_HOME"  ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
    else
      JAVACMD="$JAVA_HOME/bin/java"
    fi
  else
    JAVACMD=`which java`
  fi
fi
echo "JAVACMD_2++++"$JAVACMD

BASEDIR=$(cd "$(dirname "$0")"; cd ../; pwd)
CLASSPATH="$BASEDIR"/:"$BASEDIR"/lib/*

echo "BASEDIR++++"$BASEDIR
echo "CLASSPATH++++"$CLASSPATH


if [ -z "$OPTS_MEMORY" ] ; then
    OPTS_MEMORY=""
fi
#/export/Logs/stdout.log
if [ -z "$CONSOLE_LOG" ] ; then
#    CONSOLE_LOG="/dev/null"
    CONSOLE_LOG="./out.log"
fi

echo "JAVA_OPTS++++"$JAVA_OPTS

#nohup
 "$JAVACMD" \
  $JAVA_OPTS \
  $OPTS_MEMORY \
  -classpath "$CLASSPATH" \
  -Dfile.encoding="UTF-8" \
  com.lipengcheng.learn.loader.resource.LearnResourceLoad \
 "$@" > $CONSOLE_LOG 2>&1 &

# -Dbasedir="$BASEDIR" 这个参数貌似没啥用
