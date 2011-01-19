(ns turbid.transaction)


(defrecord Transaction [amount, date, description, debitAccount, creditAccount])

(defn transaction [amount date description debitAccount creditAccount]
  "constructor for transaction"
  (Transaction. amount date description debitAccount creditAccount))

