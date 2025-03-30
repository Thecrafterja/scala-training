extension (pL: List[PolynomPart])
    def toPolynomString(): String = {
        if pL.isEmpty then return ""

        var result = s"${pL(0).factor} * (x^${pL(0).exponent})"

        for p <- (1 until pL.size) do
            if pL(p).exponent > 0 then
                result += s" + ${pL(p).factor} * (x^${pL(p).exponent})"
            else
                result += s" + ${pL(p).factor}"

        return result
    }