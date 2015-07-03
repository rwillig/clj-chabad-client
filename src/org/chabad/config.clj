(ns org.chabad.config)


(defonce public-key         (or (System/getenv "CHABAD_DOT_ORG_PUB")
                                (System/getProperty "chabad.org-pub-key")))

(defonce secret-key         (or (System/getenv "CHABAD_DOT_ORG_SEC")
                                (System/getProperty "chabad.org-sec-key")))

(defonce base-url           (or (System/getenv "CHABAD_DOR_ORG_URL")
                                (System/getProperty "chabad.org-url")
                                "https://www.mychabad.org"))
