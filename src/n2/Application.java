package n2;

/**
 * <p>Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.</p>
 * - Exercici 2
 *
 * <p>Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.</p>
 *
 * <p>Exemple: un objecte de la classe Persona, un String i un tipus primitiu.</p>
 *
 * <p>D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.</p>
 */
public class Application{

    public static void main(String[] args) {
        Persona p = new Persona("Pepito", "Palotes", 230);
        String s = "Viva la muerte";
        int i = 42;

        GenericMethods.printGenericStuff(p, s, i);
    }
}
