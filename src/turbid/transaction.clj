(ns turbid.transaction)

;; defines a financial transaction.
(defrecord Transaction [amount, date, description, debitAccount, creditAccount])

(defn new-transaction [amount date description debitAccount creditAccount]
  "constructor for transaction"
  (Transaction. amount date description debitAccount creditAccount))

