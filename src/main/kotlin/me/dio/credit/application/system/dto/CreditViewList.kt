package me.dio.credit.application.system.dto

import me.dio.credit.application.system.entity.Credit
import java.math.BigDecimal
import java.util.*

data class CreditViewList(
    val creditCode: UUID,
    val creditValue : BigDecimal,
    val numberOdInstallments: Int,
) {
    constructor(credit: Credit): this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOdInstallments = credit.numberOfInstallments
    )
}
