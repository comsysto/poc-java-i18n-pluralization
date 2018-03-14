# poc-java-i18n-pluralization

Proof of Concept: i18n with Java and pluralization compatible to phraseapp.com

&nbsp;

### Proof of Concept Outline

 * We do **not** want `.properties` files for our translations.
 * We want `.json` files for our translations in form of:

```json
{
 "my": {
   "super": "Something"
 }
}
``` 

 * We want to use [`ResourceBundle`](https://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html) and load JSON translations into it.
 * We want to use [`MessageFormat`](https://docs.oracle.com/javase/8/docs/api/java/text/MessageFormat.html)
 * And [`ChoiceFormat`](https://docs.oracle.com/javase/8/docs/api/java/text/ChoiceFormat.html) for **pluralization**. 
 
&nbsp;

### Build and Run

```bash
./gradlw build
java -jar ./build/libs/poc-i18n-0.1.0.jar

# or run directly
./gradlw run
```



&nbsp;

### Further Reading

 * [Building Java Projects with Gradle](https://spring.io/guides/gs/gradle/)
 * [A Beginner’s Guide to Java Internationalization]()https://phraseapp.com/blog/posts/a-beginners-guide-to-java-internationalization/)
 * [Handling Plurals](https://docs.oracle.com/javase/tutorial/i18n/format/choiceFormat.html)
 * [MessageFormat and ChoiceFormat](https://docs.oracle.com/javase/8/docs/api/java/text/MessageFormat.html)
 

&nbsp;

### License

[MIT](./LICENSE) © [Bernhard Grünewaldt](https://github.com/clouless)
