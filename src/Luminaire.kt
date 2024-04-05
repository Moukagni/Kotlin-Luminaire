class Luminaire : Eclairage {
    var ampoule1 = AmpouleIncandescente("Incandescente",0, 10.0)
    var ampoule2 = AmpouleIncandescente("Incandescente",0, 10.0)
    var ampoule3 = AmpouleIncandescente("Incandescente",0, 10.0)
    var ampoule4 = AmpouleIncandescente("Incandescente",0, 10.0)
    constructor()
    override fun allumer() {
        ampoule1.allumer()
        ampoule2.allumer()
        ampoule3.allumer()
        ampoule4.allumer()
    }
    override fun eteindre() {
        ampoule1.eteindre()
        ampoule2.eteindre()
        ampoule3.eteindre()
        ampoule4.eteindre()
    }
    override fun intensifier() {
        ampoule1.intensifier()
        ampoule2.intensifier()
        ampoule3.intensifier()
        ampoule4.intensifier()
    }
    override fun diminuer() {
        ampoule1.diminuer()
        ampoule2.diminuer()
        ampoule3.diminuer()
        ampoule4.diminuer()
    }
    override fun etat(): Int {
        var etat = 0
        if (ampoule1.etat == -1 && ampoule2.etat == -1 && ampoule3.etat == -1 && ampoule4.etat == -1) {
            etat = -1
        } else {
            etat = 0
        }
        return etat
    }

    override fun toString(): String {
        return "Etat: ${ampoule1} ${ampoule2} ${ampoule3} ${ampoule4}  "


    }

}