package app

import swingRAD.*
import java.awt.Dimension
import javax.swing.*

class GUI: JFrame() {

    private val tfGrado = JTextField()
    private val pIzquierdo = JPanel()
    private val pDerecho = JPanel()

    private val tfListN = mutableListOf<JTextField>()
    private val tfListFn = mutableListOf<JTextField>()
    private val tfListK = mutableListOf<JTextField>() // K = Constantes

    //Interfaz inicial
    init{
        val lDigitar = JLabel()
        lDigitar.setProperties(490, 61, 200, 28, "Grado de la ecuación")
        add(lDigitar)

        tfGrado.setProperties(670, 60, 100, 28)
        add(tfGrado)

        val bDibujar = JButton()
        bDibujar.setProperties(575, 110, 110, 32, "Crear campos")
        bDibujar.addActionListener { dibujar() }
        add(bDibujar)

        pIzquierdo.setProperties(0, 0, 230, 300, border = null)

        val spIzquierdo = JScrollPane(
            pIzquierdo,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        )
        spIzquierdo.setProperties(390, 170, 230, 300)
        add(spIzquierdo)

        pDerecho.setProperties(0, 0, 230, 300, border = null)

        val spDerecho = JScrollPane(
            pDerecho,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        )
        spDerecho.setProperties(640, 170, 230, 300)
        add(spDerecho)

        val bCalcular = JButton()
        bCalcular.setProperties(575, 490, 110, 32, "Calcular")
        bCalcular.addActionListener { calcular() }
        add(bCalcular)

        val pSalida = JPanel()
        pSalida.setProperties(330, 542, 600, 150)
        add(pSalida)

        setMainBar("ecuaciones en recurrencia")
        setBackground("resources/backgroundBlack0.png")
        setProperties()
    }

    private fun dibujar() {
        //panel izquierdo
        pIzquierdo.removeAll()

        val lN = JLabel()
        lN.setProperties(60, 20, 40, 28, "n", fontEcuation)
        pIzquierdo.add(lN)

        val lFn = JLabel()
        lFn.setProperties(150, 20, 40, 28, "f(n)", fontEcuation)
        pIzquierdo.add(lFn)

        val grado = tfGrado.text.toInt()

        for(i in 0 until grado){
            val tfN = JTextField()
            tfN.setProperties(30, 60 + i*32, 80, 28)
            tfListN.add(tfN)
            pIzquierdo.add(tfListN[i])

            val tfFn = JTextField()
            tfFn.setProperties(120, 60 + i*32, 80, 28)
            tfListFn.add(tfFn)
            pIzquierdo.add(tfListFn[i])
        }

        pIzquierdo.setSize(230,
            if(grado>7)
                92 + grado*32
            else
                300
        )
        pIzquierdo.preferredSize = Dimension(200,
            if(grado>7)
                92 + grado*32
            else
                280
        )

        //panel derecho
        pDerecho.removeAll()

        val lCoeficientes = JLabel()
        lCoeficientes.setProperties(60, 20, 100, 28, "Coeficientes", fontEcuation)
        pDerecho.add(lCoeficientes)

        for(i in 0 .. grado) {
            val tfK = JTextField()
            tfK.setProperties(70, 60 + i * 32, 80, 28)
            tfListK.add(tfK)
            pDerecho.add(tfListK[i])
        }

        pDerecho.setSize(230,
            if(grado>6)
                124 + grado*32
            else
                300
        )
        pDerecho.preferredSize = Dimension(200,
            if(grado>7)
                124 + grado*32
            else
                280
        )

        //general
        repaint()
    }

    private fun calcular() {
        val grado = tfGrado.text.toInt()
    }

}