(ns com.jabaddon.book.fpp.command.cash-register-test
    (:use [clojure.test])
    (:use [com.jabaddon.book.fpp.command.cash-register]))

(deftest create-register
    (let [register (make-cash-register)]
        (is (= 0 @register))))

(deftest apply-purchase
    (let [register (make-cash-register)
          purchase-1 (make-purchase register 100)]
        (is (= 0 @register))
        (purchase-1)
        (is (= 100 @register))))

(deftest apply-purchase-history
    (let [register (make-cash-register)
         purchase-1 (make-purchase register 100)
         purchase-2 (make-purchase register 50)]
        (is (= 0 @register))
        (execute-purchase purchase-1)
        (execute-purchase purchase-2)
        (is (= 150 @register))
        (reset register)
        (is (= 0 @register))
        (doseq [purchase @purchases] (purchase))
        (is (= 150 @register))))

