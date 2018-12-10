
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
    
    private Element titanium4;
    private Element titanium3;
    private Element titanium2;
    
    private Element zirconium4;
    private Element zirconium2;
    
    private Element hafnium4;
    
    private Element vanadium5;
    private Element vanadium4;
    private Element vanadium3;
    private Element vanadium2;
    
    private Element chromium3;
    private Element chromium2;
    
    private Element molybdenum6;
    
    private Element niobium5;
    private Element tantalum5;
    
    private Element manganese3;
    private Element manganese2;
    
    private Element iron3;
    private Element iron2;
    
    private Element cobalt3;
    private Element cobalt2;
    
    private Element iridium4;
    private Element iridium3;
    private Element iridium2;
    
    private Element nickel2;
    
    private Element platinum4;
    private Element platinum2;
    
    private Element copper2;
    private Element copper1;
    
    private Element gold3;
    private Element gold1;
    
    private Element zinc2;
    
    private Element mercury2;
    private Element mercury1;
    
    private Element tungsten5;
    private Element tungsten4;
    private Element tungsten2;
    
    private Element silver1;
    private Element cadmium2;
    
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
        
        titanium4 = new Element("titanium (IV)", "", "ti", 4);
        titanium3 = new Element("titanium (III)", "", "ti", 3);
        titanium2 = new Element("titanium (II)", "", "ti", 2);
        
        zirconium4 = new Element("zirconium (IV)", "", "Zr", 4);
        zirconium2 = new Element("zirconium (II)", "", "Zr", 2);
        
        hafnium4 = new Element("hafnium (IV)", "", "Hf", 4);
        
        vanadium5 = new Element("vanadium (V)", "", "V", 5);
        vanadium4 = new Element("vanadium (IV)", "", "V", 4);
        vanadium3 = new Element("vanadium (III)", "", "V", 3);
        vanadium2 = new Element("vanadium (II)", "", "V", 2);
        
        niobium5 = new Element("niobium (V)", "", "Nb", 5);
        tantalum5 = new Element("tantalum (V)", "", "Ta", 5);
        
        chromium3 = new Element("chromium (III)", "", "Cr", 3);
        chromium2 = new Element("chromium (II)", "", "Cr", 2);
        
        molybdenum6 = new Element("molybdenum (VI)", "", "Mo", 6);
        
        tungsten5 = new Element("tungsten (V)", "", "W", 5);
        tungsten4 = new Element("tungsten (IV)", "", "W", 4);
        tungsten2 = new Element("tungsten (II)", "", "W", 2);
        
        manganese3 = new Element("manganese (III)", "", "Mn", 3);
        manganese2 = new Element("manganese (II)", "", "Mn", 2);
        
        iron3 = new Element("iron (III)", "", "Fe", 3);
        iron2 = new Element("iron (II)", "", "Fe", 2);
        
        cobalt3 = new Element("cobalt (III)", "", "Co", 3);
        cobalt2 = new Element("cobalt (II)", "", "Co", 2);
        
        iridium4 = new Element("iridium (IV)", "", "Ir", 4);
        iridium3 = new Element("iridium (III)", "", "Ir", 3);
        iridium2 = new Element("iridium (II)", "", "Ir", 2);
        
        nickel2 = new Element("nickel (II)", "", "Ni", 2);
        
        platinum4 = new Element("platinum (IV)", "", "Pt", 4);
        platinum2 = new Element("platinum (II)", "", "Pt", 2);
        
        copper2 = new Element("copper (II)", "", "Cu", 2);
        copper1 = new Element("copper (I)", "", "Cu", 1);
        
        silver1 = new Element("silver (I)", "", "Cu", 1);
        
        gold3 = new Element("gold (III)", "", "Au", 3);
        gold1 = new Element("gold (I)", "", "Au", 1);
        zinc2 = new Element("zinc (2)", "", "Au", 2);
        
        cadmium2 = new Element("cadmium (II)", "", "Cd", 2);
        
        mercury2 = new Element ("mercury (II)", "", "Hg", 2);
        
        HugeArray = new Element[] {hydrogen, lithium, sodium, potassium, rubidium, cesium, francium, beryllium, magnesium,
                                            calcium, strontium, barium, radium, scandium, yttrium, boron, aluminum,
                                            gallium, indium1, indium3, thallium1, thallium3, tin2, tin4, lead2, lead4,
                                            bismuth5, bismuth3, nitrogen, phosphorus, arsenic, antimony, oxygen, sulfur,
                                            selenium, tellurium, polonium, fluorine, chlorine, bromine, iodine, astatine,
                                            titanium4, titanium3, titanium2, zirconium4, zirconium2, hafnium4, vanadium5,
                                            vanadium4, vanadium3, vanadium2, niobium5, tantalum5, chromium3, chromium2,
                                            manganese3, manganese2, molybdenum6, tungsten5, tungsten4, tungsten2, iron3,
                                            iron2, cobalt3, cobalt2, iridium4, iridium3, iridium2, platinum4, platinum2,
                                            nickel2, copper2, copper1, silver1, gold3, gold1, zinc2, cadmium2, mercury2};
    }

    public Element[] getArray() {
        return HugeArray;
    }
}
