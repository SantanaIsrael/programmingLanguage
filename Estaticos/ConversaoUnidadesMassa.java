public class ConversaoUnidadesMassa {
    //Conversão de gramas
    public static float gramasForQuilogramas(float n){
        return n/100;
    }
    public static float gramasForLibras(float n){
        return n/453.6f;
    }
    public static float gramasForOncas(float n){
        return n/28.35f;
    }

    //Conversão de quilogramas
    public static float quilogramasforGramas(float n){
        return n*1000;
    }
    public static float quilogramasForLibras(float n){
        return n*2.205f;
    }
    public static float quilogramasForOnca(float n){
        return n*35.27f;
    }
    //Conversão de libras
    public static float librasforGramas(float n){
        return n*453.5f;
    }
    public static float librasforOnca(float n){
        return n*16;
    }
    public static float librasforQuilogramas(float n){
        return n/2.025f;
    }

    //Conversão de Onças
    public static float oncasforGramas(float n){
        return n*28.35f;
    }
    public static float oncasforQuilogramas(float n){
        return n/35.27f;
    }
    public static float oncasforlibras(float n){
        return n/16;
    }
}
