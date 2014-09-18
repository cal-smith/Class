(ns t1)

(defn -main [& args])

(defn kilometers2miles [d] (* d 0.62137))

(defn circumference [r] (* (* 2 3.1415) r))

(defn average [x y] (/ (+ x y) 2))

(defn greet [name] (str "Hi, " name))

(defn s2dhms [t] [ (int (/ (/ (/ t 60) 60) 24)) (int (mod (/ (/ t 60) 60) 24)) (int (mod (/ t 60) 60)) (int (mod t 60)) ])

(defn dhms2s [d h m s] (+ (* (* (* d 24) 60) 60) (* (* h 60) 60) (* m 60) s))

(println (kilometers2miles 3))
(println (circumference 2))
(println (average 1 3))
(println (greet "Bob"))
(println (s2dhms 90061))
(println (dhms2s 1 1 1 1))