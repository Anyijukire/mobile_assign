fun main() {
var Janet=BankingApplication("Ud63546ytxr",5465,6868566.97,65.7,65.7)
    println(Janet)
}
data class BankingApplication(var accountNumber: String, var userId: Int, var balance: Double, var transactionAmount: Double, var transactionFees: Double)