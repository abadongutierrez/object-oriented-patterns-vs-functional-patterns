(ns com.jabaddon.book.fpp.command.cash-register)

(def purchases (atom []))

(defn make-cash-register []
    (let [register (atom 0)]
        ;; Sets the validator-fn for the register atom.
        ;; The new state is acceptable only if the new-total is >= 0
        (set-validator! register (fn [new-total] (>= new-total 0))) register))

(defn add-cash [register to-add]
    ;; swap the value of atom 'register' to be function '+' with argument 'to-add'
    (swap! register + to-add))

(defn reset [register]
    ;; swap the value of atom 'register' to be function the result of the function (zero)
    (swap! register (fn [old-val] 0)))

(defn make-purchase [register amount]
    (fn []
        (println (str "Purchase in amount: " amount)
        (add-cash register amount))))

(defn execute-purchase [purchase]
    (swap! purchases conj purchase)
    (purchase))