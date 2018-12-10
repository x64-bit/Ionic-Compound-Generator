
public class BigArray {
    private Element hydrogen;
    private Element lithium;
    private Element sodium;
    private Element potassium;
    private Element rubidium;
    private Element cesium;
    private Element francium;
    private Element beryllium;
    private Element magnesium;
    private Element calcium;
    private Element strontium;
    private Element barium;
    private Element radium;
    private Element scandium;
    private Element yttrium;
    private Element boron;
    private Element aluminum;
    private Element gallium;
    private Element indium3;
    private Element indium1;
    private Element thallium3;
    private Element thallium1;
    private Element tin4;
    private Element tin2;
    private Element lead4;
    private Element lead2;
    private Element bismuth5;
    private Element bismuth3;

    private Element nitrogen;
    private Element phosphorus;
    private Element arsenic;
    private Element antimony;
    private Element oxygen;
    private Element sulfur;
    private Element selenium;
    private Element tellurium;
    private Element polonium;
    private Element fluorine;
    private Element chlorine;
    private Element bromine;
    private Element iodine;
    private Element astatine;

    private Element[] HugeArray;

    public BigArray() {
        hydrogen = new Element("hydrogen", "", "H", 1);
        lithium = new Element("lithium", "", "Li", 1);
        sodium = new Element("sodium", "", "Na", 1);
        potassium = new Element("potassium", "", "K", 1);
        rubidium = new Element("rubidium", "", "Rb", 1);
        cesium = new Element("cesium", "", "Cs", 1);
        francium = new Element("francium", "", "Fr", 1);
        beryllium = new Element("beryllium", "", "Be", 2);
        magnesium = new Element("magnesium", "", "Mg", 2);
        calcium = new Element("calcium", "", "Ca", 2);
        strontium = new Element("strontium", "", "Sr", 2);
        barium = new Element("barium", "", "Ba", 2);
        radium = new Element("radium", "", "Ra", 2);
        scandium = new Element("scandium", "", "Sc", 3);
        yttrium = new Element("yttrium", "", "Y", 3);
        boron = new Element("boron", "", "B", 3);
        aluminum = new Element("aluminum", "", "Al", 3);
        gallium = new Element("gallium", "", "Ga", 3);
        indium3 = new Element("indium (III)", "", "In", 3);
        indium1 = new Element("indium (I)", "", "In", 1);
        thallium3 = new Element("thallium (III)", "", "Tl", 3);
        thallium1 = new Element("thallium (I)", "", "Tl", 1);
        tin4 = new Element("tin (IV)", "", "Sn", 4);
        tin2 = new Element("tin (II)", "", "Sn", 2);
        lead4 = new Element("lead (IV)", "", "Pb", 4);
        lead2 = new Element("lead (II)", "", "Pb", 2);
        bismuth5 = new Element("bismuth", "", "Bi", 5);
        bismuth3 = new Element("bismuth", "", "Bi", 3);

        nitrogen = new Element("nitrogen", "nitride", "N", -3);
        phosphorus = new Element("phosphorus", "phosphide", "P", -3);
        arsenic = new Element("arsenic", "arsenide", "As", -3);
        antimony = new Element("antimony", "antimonide", "Sb", -3);
        oxygen = new Element("oxygen", "oxide", "O", -2);
        sulfur = new Element("sulfur", "sulfide", "S", -2);
        selenium = new Element("selenium", "selenide", "Se", -2);
        tellurium = new Element("tellurium", "telluride", "Te", -2);
        polonium = new Element("polonium", "polonide", "Po", -2);
        fluorine = new Element("fluorine", "fluoride", "Fl", -1);
        chlorine = new Element("chlorine", "chloride", "Cl", -1);
        bromine = new Element("bromine", "bromide", "Br", -1);
        iodine = new Element("iodine", "iodide", "I", -1);
        astatine = new Element("astatine", "astatide", "At", -1);
        HugeArray = new Element[] {hydrogen, lithium, sodium, potassium, rubidium, cesium, francium, beryllium, magnesium,
                                            calcium, strontium, barium, radium, scandium, yttrium, boron, aluminum,
                                            gallium, indium1, indium3, thallium1, thallium3, tin2, tin4, lead2, lead4,
                                            bismuth5, bismuth3, nitrogen, phosphorus, arsenic, antimony, oxygen, sulfur,
                                            selenium, tellurium, polonium, fluorine, chlorine, bromine, iodine, astatine};
    }

    public Element[] getArray() {
        return HugeArray;
    }
}
