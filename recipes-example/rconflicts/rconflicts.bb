SUMMARY = "Example to explain the usage of rdepends"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://bashfile_rp.sh"

S = "${WORKDIR}"
RDEPENDS:${PN} = "bash"
RCONFLICTS:${PN} = "rconflicts1 (> 1.1) "

do_install() {

    install -d ${D}${bindir}
    install -m 0755 ${S}/bashfile_rp.sh ${D}${bindir}/

}