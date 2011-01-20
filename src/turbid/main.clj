(ns turbid.main
  (:require [turbid.transaction :as transaction]
            [turbid.account :as account]))

;; namespace tracking the current state of progress. This will slowly
;; evolve into a program reading transactions and categorizing them

(def rabobank-rekening
  (account/new-asset-account "Rabobank Rekening" "cash"))

(def opening-balance
  (account/new-equity-account "Opening Balances" "income"))

(def income-account
  (account/new-equity-account "Unspecified Income" "income"))

(def expense-account
  (account/new-equity-account "Unspecified Expenses" "expense"))

(def transactions [])

;; small change here to check if magit picks this up
;; and allows me to commit this easily
;; (conj transactions (transaction/new-transaction 100.00                
