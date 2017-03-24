LICENSE = "CLOSED"

SRC_URI = " \
    file://include \
"

do_install() {
        install -d ${D}/${includedir}
        cp -rf ${WORKDIR}/include/* ${D}/${includedir}/
}
