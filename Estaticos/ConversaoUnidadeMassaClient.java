public class ConversaoUnidadeMassaClient {
    public static void main(String[] args) {
        System.out.println("Libras para gramas:" + ConversaoUnidadesMassa.librasforGramas(1));
        System.out.println("Libra para quilogramas:" + ConversaoUnidadesMassa.librasforQuilogramas(1));
        System.out.println("Libra para oncas: " + ConversaoUnidadesMassa.librasforOnca(1));
        System.out.println("Gramas para libras: " + ConversaoUnidadesMassa.gramasForLibras(1));
        System.out.println("Gramas para quilogramas: " + ConversaoUnidadesMassa.gramasForQuilogramas(1));
        System.out.println("Gramas para oncas:" + ConversaoUnidadesMassa.gramasForOncas(1));
        System.out.println("Oncas para gramas: " + ConversaoUnidadesMassa.oncasforGramas(1));
        System.out.println("Oncas para libras: " + ConversaoUnidadesMassa.oncasforlibras(1));
        System.out.println("Oncas para quilogramas: " + ConversaoUnidadesMassa.oncasforQuilogramas(1));
        System.out.println("Quilogramas para libras" + ConversaoUnidadesMassa.quilogramasForLibras(1));
        System.out.println("Quilogramas para onca: " + ConversaoUnidadesMassa.quilogramasForOnca(1));
        System.out.println("Quilogramas para gramas: " + ConversaoUnidadesMassa.quilogramasforGramas(1));
    }
}