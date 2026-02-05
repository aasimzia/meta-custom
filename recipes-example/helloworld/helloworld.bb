SUMMARY = "A simple Hello World example"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "git://github.com/aasimzia/meta-custom.git;protocol=https;branch=main"
SRCREV = "e2b8c35bc448ddeac76e6ae13c6933fd596bc148"

SRC_URI:append = " file://helloworld.patch"
                      
S = "${WORKDIR}/git"

do_compile() {
    # ${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/helloworld.c -o ${S}/helloworld
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}//recipes-example/helloworld/files/helloworld.c -o ${S}/helloworld
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloworld ${D}${bindir}/helloworld
}


