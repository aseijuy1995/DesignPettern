package edu.yujie.designpettern.state.example1

class MetricSystem {
    private var state: State? = null

    fun setState(state: State) {
        this.state = state
    }

    fun tempView(temp: Double) = state?.tempToDisplay(temp)

    fun vibView(vib: Double) = state?.vibToDisplay(vib)

    fun temSave(temp: Double) = state?.tempToSave(temp)

    fun vibSave(vib: Double) = state?.vibToSave(vib)
}
