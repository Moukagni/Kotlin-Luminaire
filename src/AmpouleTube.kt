class AmpouleTube {
    constructor(nom: String, etat: Int, probaPanne: Double) : super(nom, etat, probaPanne)

    override fun intensifier() {
        allumer()
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    override fun diminuer() {
        eteindre()
    }
}

