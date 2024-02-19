package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class creditDto(
    @field:NotNull(message = "Invalid Input") val creditValue: BigDecimal,
    @field:Future(message = "Invalid Input")val dayFirstInstallment: LocalDate,
    @field:Min(value = 20 , message = "Invalid number") val numberOfInstallments: Int,
    @field:NotEmpty(message = "Invalid Input") val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}
