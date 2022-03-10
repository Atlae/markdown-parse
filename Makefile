CLASSPATH = "lib/*:."

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
test: MarkdownParse.class MarkdownParseTest.class
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp $(CLASSPATH) MarkdownParseTest.java

TryCommonMark.class: TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java
