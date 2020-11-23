package app

import swingRAD.setBackground
import swingRAD.setMainBar
import swingRAD.setProperties
import javax.swing.*

class GUI: JFrame() {

    private val tfGrado = JTextField()
    private val pIzquierdo = JPanel()
    private val spIzquierdo = JScrollPane(
        pIzquierdo,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
    )
    private val pDerecho = JPanel()
    private val spDerecho = JScrollPane(
        pDerecho,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
    )

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

        spIzquierdo.setProperties(390, 170, 230, 300)
        add(spIzquierdo)

        pDerecho.setProperties(0, 0, 230, 300, border = null)

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
        val grado = tfGrado.text.toInt()
    }

    private fun calcular() {
        val grado = tfGrado.text.toInt()
    }

}