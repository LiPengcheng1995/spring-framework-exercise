
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
    OPTS_MEMORY="-Xms2048M -Xmx2048M -Xmn1024M -XX:MaxPermSize=512M -server -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./java_HeapDump.hprof -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:+CMSConcurrentMTEnabled -XX:CMSInitiatingOccupancyFraction=80 -XX:ParallelGCThreads=2 -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=256m"
fi
#/export/Logs/stdout.log
if [ -z "$CONSOLE_LOG" ] ; then
#    CONSOLE_LOG="/dev/null"
    CONSOLE_LOG="./out.log"
fi

#nohup
 "$JAVACMD" \
  $JAVA_OPTS \
  $OPTS_MEMORY \
  -classpath "$CLASSPATH" \
  -Dbasedir="$BASEDIR" \
  -Dfile.encoding="UTF-8" \
  com.lpc.SpringProviderMain \
 "$@" > $CONSOLE_LOG 2>&1 &
