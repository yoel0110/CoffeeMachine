package entities;

public class MaquinaDeCafe {

    private Cafetera cafetera;
    public Vaso vasosPequeno;
    public Vaso vasosMediano;
    public Vaso vasosGrande;
    public Vaso vasosPremiun;
    private Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public Vaso getTipoDeVaso(String tipo) {

        switch (tipo.toLowerCase()) {
            case "pequeno":
                return vasosPequeno;

            case "mediano":
                return vasosMediano;

            case "grande":
                return vasosGrande;
            case "premiun":
                return vasosPremiun;
            default:
                return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadVasos,
                                int cantidadAzucar) {

        if (vaso == null || !vaso.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }

        if (cafetera == null ||
                !cafetera.hasCafe(vaso.getContenido() * cantidadVasos)) {
            return "No hay Cafe";
        }

        if (azucarero == null ||
                !azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadVasos);

        cafetera.giveCafe(vaso.getContenido() * cantidadVasos);

        azucarero.giveAzucar(cantidadAzucar);

        return "Felicitaciones";
    }
}