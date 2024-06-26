package ru.textanalysis.tawt.ms.dictionary.additional.words.convertor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ru.textanalysis.tawt.ms.constant.Const.COMMA_SEPARATOR;
import static ru.textanalysis.tawt.ms.constant.TypeOfSpeechs.*;

/**
 * Хранение преобразованания тегов с Wiktionary в стандарт OpenCorpora
 */
public class TagsForOpenCorporaDictionaryConversion {

    private final Map<String, String> tagsDictionary;
    private final List<String> toSDictionary;

    public TagsForOpenCorporaDictionaryConversion() {
        tagsDictionary = new HashMap<>();
        tagsDictionary.put("прилагательное", ADJF);
        tagsDictionary.put("качественное", "Qual");
        tagsDictionary.put("ед. ч.", "sing");
        tagsDictionary.put("мн. ч.", "plur");
        tagsDictionary.put("муж. р.", "masc");
        tagsDictionary.put("ср. р.", "neut");
        tagsDictionary.put("жен. р.", "femn");
        tagsDictionary.put("существительное", NOUN);
        tagsDictionary.put("притяжательное прилагательное", ADJF + COMMA_SEPARATOR + "Poss");
        tagsDictionary.put("прилагательное (притяжательное)", ADJF + COMMA_SEPARATOR + "Poss");
        tagsDictionary.put("прилагательное (относительное)", ADJF);
        tagsDictionary.put("относительное прилагательное", ADJF);
        tagsDictionary.put("местоименное прилагательное", ADJF + ",Apro");
        tagsDictionary.put("притяжательное местоимение (местоименное прилагательное)", NPRO + COMMA_SEPARATOR + "Poss");
        tagsDictionary.put("определительное местоимение (местоименное прилагательное)", ADJF + COMMA_SEPARATOR + "Apro");
        tagsDictionary.put("общий род (может согласовываться с другими частями речи как мужского, так и женского рода)", "ms-f");
        tagsDictionary.put("им.", "nomn");
        tagsDictionary.put("р.", "gent");
        tagsDictionary.put("д.", "datv");
        tagsDictionary.put("в.", "accs");
        tagsDictionary.put("т.", "ablt");
        tagsDictionary.put("тв.", "ablt");
        tagsDictionary.put("п.", "loct");
        tagsDictionary.put("пр.", "loct");
        tagsDictionary.put("одуш.", "anim");
        tagsDictionary.put("неод.", "inan");
        tagsDictionary.put("глагол", VERB);
        tagsDictionary.put("одушевлённое", "anim");
        tagsDictionary.put("неодушевлённое", "inan");
        tagsDictionary.put("совершенный вид", "perf");
        tagsDictionary.put("переходный", "tran");
        tagsDictionary.put("несовершенный вид", "impf");
        tagsDictionary.put("непереходный", "intr");
        tagsDictionary.put("будущ.", "futr");
        tagsDictionary.put("прош.", "past");
        tagsDictionary.put("наст.", "pres");
        tagsDictionary.put("повелит.", "impr");
        tagsDictionary.put("средний род", "neut");
        tagsDictionary.put("мужской род", "masc");
        tagsDictionary.put("женский род", "femn");
        tagsDictionary.put("действительное причастие", PRTF + COMMA_SEPARATOR + "actv");
        tagsDictionary.put("страдательное причастие", PRTF + COMMA_SEPARATOR + "pssv");
        tagsDictionary.put("совершенного вида", "perf");
        tagsDictionary.put("несовершенного вида", "impf");
        tagsDictionary.put("прошедшего времени", "past");
        tagsDictionary.put("настоящего времени", "pres");
        tagsDictionary.put("будущего времени", "futr");
        tagsDictionary.put("невозвратное деепричастие", GRND);
        tagsDictionary.put("возвратное деепричастие", GRND + COMMA_SEPARATOR + "Refl");
        tagsDictionary.put("возвратный", "Refl");
        tagsDictionary.put("возвратное причастие", PRTF + COMMA_SEPARATOR + "Refl");
        tagsDictionary.put("числительное", NUMR);
        tagsDictionary.put("порядковое", "Anum");
        tagsDictionary.put("вводное слово", CONJ + COMMA_SEPARATOR + "Prnt");
        tagsDictionary.put("также вводное слово", "Prnt");
        tagsDictionary.put("наречие", ADVB);
        tagsDictionary.put("предлог", PREP);
        tagsDictionary.put("союз", CONJ);
        tagsDictionary.put("частица", PRCL);
        tagsDictionary.put("междометие", INTJ);
        tagsDictionary.put("я", "1per");
        tagsDictionary.put("мы", "1per");
        tagsDictionary.put("ты", "2per");
        tagsDictionary.put("вы", "2per");
        tagsDictionary.put("он она оно", "3per");
        tagsDictionary.put("они", "3per");
        tagsDictionary.put("местоимение (притяжательное)", ADJF + COMMA_SEPARATOR + "Apro");
        tagsDictionary.put("предикатив", PRED);
        tagsDictionary.put("порядковое числительное (счётное прилагательное)", ADJF + COMMA_SEPARATOR + "Anum");
        tagsDictionary.put("порядковое числительное", ADJF + COMMA_SEPARATOR + "Anum");
        tagsDictionary.put("счётное прилагательное", ADJF + COMMA_SEPARATOR + "Anum");

        toSDictionary = new ArrayList<>();
        toSDictionary.add(ADJF);
        toSDictionary.add(ADJS);
        toSDictionary.add(NOUN);
        toSDictionary.add(PRED);
        toSDictionary.add(INTJ);
        toSDictionary.add(PRCL);
        toSDictionary.add(CONJ);
        toSDictionary.add(PREP);
        toSDictionary.add(ADVB);
        toSDictionary.add(NUMR);
        toSDictionary.add(PRTF);
        toSDictionary.add(PRTS);
        toSDictionary.add(GRND);
        toSDictionary.add(VERB);
        toSDictionary.add(INFN);
        toSDictionary.add(NPRO);
    }

    public Map<String, String> getTags() {
        return tagsDictionary;
    }

    public List<String> getToS() {
        return toSDictionary;
    }
}