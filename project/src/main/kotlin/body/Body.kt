package body

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv

class Body: RComponent<RProps, RState>()  {
    override fun RBuilder.render() {
        styledDiv {
            css{
                width = 100.vw
                position= Position.fixed
                top = 27.5.vh
                alignContent= Align.center
            }
            styledDiv {
                css{
                    width = 100.pct
                    display = Display.flex
                    flexDirection = FlexDirection.column
                    alignItems = Align.center
                }

                child(StarterContent::class){}
                child(Contact::class) {}
            }
        }
    }
}