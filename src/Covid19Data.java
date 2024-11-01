public class Covid19Data {
   private String Region;
   private String aldersGruppe;
   private String dato;
   private int tilfældeiAlt;
   private int døde;
   private int indlagtePåIntensiv;
   private int indlagte;

   public Covid19Data(String Region, String aldersGruppe, String dato, int tilfældeiAlt, int døde, int indlagte, int indlagtePåIntensiv) {
       this.Region = Region;
       this.dato = dato;
       this.aldersGruppe = aldersGruppe;
       this.døde = døde;
       this.indlagte = indlagte;
       this.tilfældeiAlt = tilfældeiAlt;
       this.indlagtePåIntensiv = indlagtePåIntensiv;
   }

   @Override
    public String toString() {
   return "Covid19Data{" +
           "region='" + Region + '\'' +
           ", aldersgruppe='" + aldersGruppe + '\'' +
           ", tilfældeiAlt" + tilfældeiAlt +
           ", indlatePåIntensiv" + indlagtePåIntensiv +
           ", antalIndlagte=" + indlagte +
           ", døde=" + døde +
           ", dato='" + dato + '\'' +
           '}';
   }
}
